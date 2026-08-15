//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_types_inner.g.dart';

/// PokemonDetailTypesInner
///
/// Properties:
/// * [slot] 
/// * [type] 
@BuiltValue()
abstract class PokemonDetailTypesInner implements Built<PokemonDetailTypesInner, PokemonDetailTypesInnerBuilder> {
  @BuiltValueField(wireName: r'slot')
  int get slot;

  @BuiltValueField(wireName: r'type')
  AbilityDetailPokemonInnerPokemon get type;

  PokemonDetailTypesInner._();

  factory PokemonDetailTypesInner([void updates(PokemonDetailTypesInnerBuilder b)]) = _$PokemonDetailTypesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailTypesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailTypesInner> get serializer => _$PokemonDetailTypesInnerSerializer();
}

class _$PokemonDetailTypesInnerSerializer implements PrimitiveSerializer<PokemonDetailTypesInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailTypesInner, _$PokemonDetailTypesInner];

  @override
  final String wireName = r'PokemonDetailTypesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailTypesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
    yield r'type';
    yield serializers.serialize(
      object.type,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailTypesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailTypesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.type.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailTypesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailTypesInnerBuilder();
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

