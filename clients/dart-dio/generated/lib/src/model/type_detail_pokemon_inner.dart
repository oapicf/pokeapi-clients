//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/type_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_pokemon_inner.g.dart';

/// TypeDetailPokemonInner
///
/// Properties:
/// * [slot] 
/// * [pokemon] 
@BuiltValue()
abstract class TypeDetailPokemonInner implements Built<TypeDetailPokemonInner, TypeDetailPokemonInnerBuilder> {
  @BuiltValueField(wireName: r'slot')
  int? get slot;

  @BuiltValueField(wireName: r'pokemon')
  TypeDetailPokemonInnerPokemon? get pokemon;

  TypeDetailPokemonInner._();

  factory TypeDetailPokemonInner([void updates(TypeDetailPokemonInnerBuilder b)]) = _$TypeDetailPokemonInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailPokemonInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailPokemonInner> get serializer => _$TypeDetailPokemonInnerSerializer();
}

class _$TypeDetailPokemonInnerSerializer implements PrimitiveSerializer<TypeDetailPokemonInner> {
  @override
  final Iterable<Type> types = const [TypeDetailPokemonInner, _$TypeDetailPokemonInner];

  @override
  final String wireName = r'TypeDetailPokemonInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slot != null) {
      yield r'slot';
      yield serializers.serialize(
        object.slot,
        specifiedType: const FullType(int),
      );
    }
    if (object.pokemon != null) {
      yield r'pokemon';
      yield serializers.serialize(
        object.pokemon,
        specifiedType: const FullType(TypeDetailPokemonInnerPokemon),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetailPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailPokemonInnerBuilder result,
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
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeDetailPokemonInnerPokemon),
          ) as TypeDetailPokemonInnerPokemon;
          result.pokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetailPokemonInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailPokemonInnerBuilder();
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

