//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_detail_form_names_inner.g.dart';

/// PokemonFormDetailFormNamesInner
///
/// Properties:
/// * [language] 
/// * [name] 
@BuiltValue()
abstract class PokemonFormDetailFormNamesInner implements Built<PokemonFormDetailFormNamesInner, PokemonFormDetailFormNamesInnerBuilder> {
  @BuiltValueField(wireName: r'language')
  AbilityDetailPokemonInnerPokemon get language;

  @BuiltValueField(wireName: r'name')
  String get name;

  PokemonFormDetailFormNamesInner._();

  factory PokemonFormDetailFormNamesInner([void updates(PokemonFormDetailFormNamesInnerBuilder b)]) = _$PokemonFormDetailFormNamesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormDetailFormNamesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormDetailFormNamesInner> get serializer => _$PokemonFormDetailFormNamesInnerSerializer();
}

class _$PokemonFormDetailFormNamesInnerSerializer implements PrimitiveSerializer<PokemonFormDetailFormNamesInner> {
  @override
  final Iterable<Type> types = const [PokemonFormDetailFormNamesInner, _$PokemonFormDetailFormNamesInner];

  @override
  final String wireName = r'PokemonFormDetailFormNamesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormDetailFormNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormDetailFormNamesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormDetailFormNamesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.language.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormDetailFormNamesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormDetailFormNamesInnerBuilder();
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

