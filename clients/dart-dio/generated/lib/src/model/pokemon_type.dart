//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/type_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_type.g.dart';

/// PokemonType
///
/// Properties:
/// * [slot] - The order the Pokémon's types are listed in.
/// * [type] - The type the referenced Pokémon has.
@BuiltValue()
abstract class PokemonType implements Built<PokemonType, PokemonTypeBuilder> {
  /// The order the Pokémon's types are listed in.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The type the referenced Pokémon has.
  @BuiltValueField(wireName: r'type')
  TypeSummary get type;

  PokemonType._();

  factory PokemonType([void updates(PokemonTypeBuilder b)]) = _$PokemonType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonType> get serializer => _$PokemonTypeSerializer();
}

class _$PokemonTypeSerializer implements PrimitiveSerializer<PokemonType> {
  @override
  final Iterable<Type> types = const [PokemonType, _$PokemonType];

  @override
  final String wireName = r'PokemonType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonType object, {
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
      specifiedType: const FullType(TypeSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonTypeBuilder result,
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
            specifiedType: const FullType(TypeSummary),
          ) as TypeSummary;
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
  PokemonType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonTypeBuilder();
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


