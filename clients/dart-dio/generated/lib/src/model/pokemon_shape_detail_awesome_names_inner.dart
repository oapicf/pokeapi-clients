//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_shape_detail_awesome_names_inner.g.dart';

/// PokemonShapeDetailAwesomeNamesInner
///
/// Properties:
/// * [awesomeName] 
/// * [language] 
@BuiltValue()
abstract class PokemonShapeDetailAwesomeNamesInner implements Built<PokemonShapeDetailAwesomeNamesInner, PokemonShapeDetailAwesomeNamesInnerBuilder> {
  @BuiltValueField(wireName: r'awesome_name')
  String get awesomeName;

  @BuiltValueField(wireName: r'language')
  AbilityDetailPokemonInnerPokemon get language;

  PokemonShapeDetailAwesomeNamesInner._();

  factory PokemonShapeDetailAwesomeNamesInner([void updates(PokemonShapeDetailAwesomeNamesInnerBuilder b)]) = _$PokemonShapeDetailAwesomeNamesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonShapeDetailAwesomeNamesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonShapeDetailAwesomeNamesInner> get serializer => _$PokemonShapeDetailAwesomeNamesInnerSerializer();
}

class _$PokemonShapeDetailAwesomeNamesInnerSerializer implements PrimitiveSerializer<PokemonShapeDetailAwesomeNamesInner> {
  @override
  final Iterable<Type> types = const [PokemonShapeDetailAwesomeNamesInner, _$PokemonShapeDetailAwesomeNamesInner];

  @override
  final String wireName = r'PokemonShapeDetailAwesomeNamesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonShapeDetailAwesomeNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'awesome_name';
    yield serializers.serialize(
      object.awesomeName,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonShapeDetailAwesomeNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonShapeDetailAwesomeNamesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'awesome_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.awesomeName = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonShapeDetailAwesomeNamesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonShapeDetailAwesomeNamesInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

