//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_detail_machines_inner_machine.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_machines_inner.g.dart';

/// MoveDetailMachinesInner
///
/// Properties:
/// * [machine] 
/// * [versionGroup] 
@BuiltValue()
abstract class MoveDetailMachinesInner implements Built<MoveDetailMachinesInner, MoveDetailMachinesInnerBuilder> {
  @BuiltValueField(wireName: r'machine')
  MoveDetailMachinesInnerMachine get machine;

  @BuiltValueField(wireName: r'version_group')
  AbilityDetailPokemonInnerPokemon get versionGroup;

  MoveDetailMachinesInner._();

  factory MoveDetailMachinesInner([void updates(MoveDetailMachinesInnerBuilder b)]) = _$MoveDetailMachinesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailMachinesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailMachinesInner> get serializer => _$MoveDetailMachinesInnerSerializer();
}

class _$MoveDetailMachinesInnerSerializer implements PrimitiveSerializer<MoveDetailMachinesInner> {
  @override
  final Iterable<Type> types = const [MoveDetailMachinesInner, _$MoveDetailMachinesInner];

  @override
  final String wireName = r'MoveDetailMachinesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailMachinesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'machine';
    yield serializers.serialize(
      object.machine,
      specifiedType: const FullType(MoveDetailMachinesInnerMachine),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailMachinesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailMachinesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'machine':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDetailMachinesInnerMachine),
          ) as MoveDetailMachinesInnerMachine;
          result.machine.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailMachinesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailMachinesInnerBuilder();
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

